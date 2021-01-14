-- dept 테이블의 정보 출력
desc dept;

-- dept 테이블의 모든 컬럼 출력
select * from dept;

-- emp 테이블의 empno 컬럼 출력
select EMPNO from EMP;

-- emp 테이블에서 sal의 내용이 3000 초과인 모든 컬럼 출력
select * from emp where sal > 3000;

-- emp 테이블에서 sal의 내용이 3000 이하인 모든 컬럼 출력
select * from emp where sal <= 3000;

-- emp 테이블에서 ename, sal 그리고 sal 내용의 100을 더한 컬럼 출력
select ename, sal, sal+100 from emp;

-- emp 테이블에서 deptno가 20인 모든 컬럼 출력
select * from emp where deptno = 20;

-- emp 테이블에서 deptno가 20이 아닌 모든 컬럼 출력
select * from emp where deptno != 20;
select * from emp where deptno <> 20;
select * from emp where not deptno = 20;

-- 이름(ENAME)이 FORD인 사람의 사번(empno), 이름(ename), 급여(SAL)를 출력하는 쿼리문
select empno, ename, sal from emp where ename = 'FORD';

-- 1982년 1월 1일 이후에 입사한 사원을 출력하는 쿼리문
select ename from emp where hiredate >= date '1982-01-01';
select ename from emp where hiredate >= date '1982.01.01';
select ename from emp where hiredate >= date '1982/01/01';

-- job이 MANAGER이고 10번 부서 사원을 출력하는 쿼리문
select ename from emp where job = 'MANAGER' AND deptno = 10;

-- job이 MANAGER 이거나 10번 부서인 사원
select ename from emp where job = 'MANAGER' OR deptno = 10;

-- 10번 부서가 아닌 사원
select ename from emp where not deptno = 10;

-- 급여가 2000~3000 사이의 사원을 검색하는 쿼리문
select ename from emp where sal >= 2000 AND sal <= 3000;
select ename from emp where sal between 2000 and 3000;

-- 급여가 2000 미만이거나 3000 초과인 사원을 검색하는 쿼리문
select ename from emp where sal < 2000 OR sal > 3000;
select ename from emp where sal not between 2000 and 3000;

-- 1987년에 입사한 사원을 출력하는 쿼리문
select ename from emp where hiredate between '1987-01-01' and '1987-12-31';

-- 커미션(COMM)이 300 혹은 500 혹은 1400인 사원이 있는지 검색하는 쿼리문
select ename from emp where comm = 300 OR comm = 500 OR comm = 1400;
select ename from emp where comm in (300, 500, 1400);

-- 커미션(COMM)이 300 혹은 500 혹은 1400이 아닌 사원이 있는지 검색하는 쿼리문
select ename from emp where comm not in (300, 500, 1400);

-- 이름이 F로 시작하는 사람을 찾는 쿼리문
select ename from emp where ename LIKE 'F%';

-- 위치 상관 없이 이름 중에 A가 들어있는 사람을 찾는 쿼리문
select * from emp where ename LIKE '%A%';

-- 이름이 N으로 끝나는 사람을 찾는 쿼리문
select * from emp where ename LIKE '%N';

-- 이름이 두 번째 글자가 A인 사원을 찾는 쿼리문
select * from emp where ename LIKE '_A%';

-- 이름이 세 번째 글자가 A인 사원을 찾는 쿼리문
select * from emp where ename LIKE '__A%';

-- 이름이 A를 포함하지 않는 사원을 찾는 쿼리문
select * from emp where ename not LIKE '%A%';

-- 오라클은 컬럼에 NULL값이 저장되는 것을 허용한다.
-- 왜냐하면 null이 저장되어 있는 경우에는 =연산자로 판단할 수 없기 때문이다.
-- 따라서 해당 문법의 null 조건은 올바른 식이 아니다.
select ename, job, comm from emp where comm=null;

-- is null
select * from emp where comm is null;

-- is not null
select * from emp where comm is not null;

-- 사원들의 급여를 오름차순으로 정렬하는 쿼리문
select * from emp order by sal asc;

-- 가장 최근에 입사한 사원부터 출력하는 쿼리문
select * from emp order by hiredate desc;

-- 사원의 이름은 오름차순대로 출력하는 쿼리문
select * from emp order by ename asc;

-- 사원들이 소속되어 있는 부서의 번호를 출력하는 쿼리문
select distinct deptno from emp;

-- 사원들이 소속되어 있는 JOB의 종류들을 출력하는 쿼리문
select DISTINCT job from emp;

-- 사원의 ename 컬럼이 "이름"이란 컬럼명으로 출력하는 쿼리문
SELECT ename as "이름" from emp;

-- 사원들의 이름과 연봉을 출력하는 쿼리문(comm이 NULL이면 0으로 처리)
select ename, sal*12 + NVL(comm, 0) "연봉" from emp;

-- 두 컬럼의 속성값을 ' is a '라는 내용을 통해 접합하는 쿼리문
select ename || ' is a ' || job "연결점의 예" from emp;

-- 산술 연산의 결과를 한 줄로 얻기 위해서 오라클에서 제공하는 테이블
select 24*60 from dual;

-- 오라클 제공 테이블(dual)에서 절대값(abs) 출력 
select -10, abs(-10) from dual;

-- 지정한 숫자 식보다 작거나 같은 최대 정수를 반환
select 34.5432, floor(34.5432) from dual;

-- 소수점 반올림
select 34.5432, round(34.5432) from dual;
-- 소수점 반올림(음수면은 정수 자리 수, 양수면은 소수점 자리 수)
select 34.5432, round(34.5432, 2) from dual;
select 34.5432, round(34.5432, -1) from dual;

-- 소수점 절사
select 34.5432, trunc(34.5432) from dual;
-- 소수점 절사(음수면은 정수 자리수, 0은 소수, 양수는 소수점 자리 수)
select 34.5432, trunc(34.5432, 0) from dual;
select 34.5432, trunc(34.5432, -1) from dual;

-- 나눈값의 나머지(%)
SELECT mod(27,2) from dual;

-- 문자를 대/소문자로 변경
select upper('Welcome to Oracle') from dual;
select lower('Welcome to Oracle') from dual;

-- 이니셜만 대문자로 변환
select initcap('Welcome to Oracle') from dual;

-- 문자의 길이
select length('oracle') from dual;

-- 문자의 바이트 크기
select lengthb('oracle') from dual;

-- 찾고자 하는 문자 키워드의 위치(오라클은 인덱스가 0이 아닌 1부터 시작)
select instr('Welcome to Oracle', 'O') from dual;

-- 인덱스 4부터 시작해서 문자 3개 슬라이싱
select substr('Welcome to Oracle', 4, 3) from dual;

-- 사원들의 입사일에서 입사 년도와 입사 월을 출력하는 쿼리문
select ename, 19||substr(hiredate, 1, 2)년도, substr(hiredate, 4, 2)월 from emp;

-- 9월에 입사한 사원을 출력하는 쿼리문
select ename, 19||hiredate from emp where substr(hiredate, 4, 2) = '09';

-- 20개의 자리를 마련한 후 대상 문자열을 출력하고,
-- 왼쪽/오른쪽에 생긴 빈 공간을 '#' 기호로 채우는 쿼리문
select lpad('oracle', 20, '#') from dual;
select rpad('oracle', 20, '#') from dual;

-- 해당 문자열에서 지정한 키워드만 잘라내서 출력하는 쿼리문
select trim('a' from 'aaaaORACLEaaaaa') from dual;
select trim(' ORACLE ') from dual;

-- 오라클 제공 테이블(dual)에서 날짜(sysdate) 출력
select sysdate from dual;
select sysdate-1 어제, sysdate 오늘, sysdate+1 내일 from dual;

-- 각 직원들이 근무한 개월 수를 구하는 쿼리문(months_between)
select ename, sysdate, hiredate, months_between(sysdate, hiredate) 근무개월수 from emp;
select ename, sysdate, hiredate, trunc(months_between(sysdate, hiredate)) 근무개월수 from emp;

-- 입사 날짜에서 4개월을 추가한 결과값을 나타내는 쿼리문(add_month)
select ename, hiredate, add_months(hiredate, 4) from emp;

-- 오늘을 기준으로 가장 가까운 다음 수요일은 언제인지 알아보는 쿼리문(next_day)
select sysdate, next_day(sysdate, '수요일') from dual;

-- 해당 달의 마지막 날짜를 반환(last_day)
select hiredate, last_day(hiredate) from emp;

-- 날짜형 혹은 숫자형을 문자형으로 변환
select sysdate, to_char(sysdate, 'YYYY-MM-DD') from dual;

-- 사원들의 입사일을 출력하되, 요일까지 함께 출력하는 쿼리문
select hiredate, to_char(hiredate, 'YYYY/MM/DD DAY') from emp;

-- 현재 날짜와 시간을 출력하는 쿼리문
select to_char(sysdate, 'YYYY/MM/DD, HH24:MI:SS') from dual;

-- 각 지역별 통화 기호를 앞에 붙이고
-- 천 단위마다 콤마를 붙여서 출력하는 쿼리문 (예: \1,230,000)
select ename, sal, to_char(sal, 'L999,999') from emp;

-- 문자형을 날짜형으로 변환하는 함수.
select ename, hiredate from emp where hiredate=to_date(19810220, 'YYYYMMDD');

-- 올해 며칠이 지났는지 현재 날짜에서 2016/01/01을 뺀 결과
select trunc(sysdate - to_date('2016/01/01', 'YYYY/MM/DD')) from dual;

-- to_number(문자형에서 숫자형으로 변환)
select to_number('20,000', '99,999') - to_number('10,000', '99,999') from dual;

-- null을 다른 값으로 변환하는 nvl 함수
select ename, sal, nvl(comm, 0), job from emp order by job;

-- decode 함수(java의 switch~case문과 같은 기능)
-- 사원의 부서 번호를 이름으로 설정하는 쿼리문
select deptno, decode(deptno, 10, 'A', 20, 'B', 'DEFAULT') from emp order by deptno;
select ename, deptno, decode(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS') as DNAME from emp;

-- 조건에 따라 서로 다른 처리가 가능한 case 함수
-- (java의 if~else문과 같은 기능)
-- decode 함수는 조건이 일치(비교연산자)하는 경우에만 적용하지만
-- case 함수는 다양한 비교 연산자를 적용하여 조건 및 범위를 지정할 수 있다.
select ename, deptno,
    case when deptno=10 then 'ACCOUNTING'
         when deptno=20 then 'RESEARCH'
         when deptno=30 then 'SALES'
         when deptno=40 then 'OPERATIONS'
    end as DNAME from emp;
    
-- 총 급여를 구하는 쿼리문
select count(*) from emp;
select sum(sal) from emp;

-- 급여 평균을 구하는 쿼리문
select trunc(avg(sal)) from emp;

-- 가장 높은 급여와 가장 낮은 급여를 구하는 쿼리문
select min(sal), max(sal) from emp;

-- 사원 테이블의 사원들 중에서 커미션(comm)을 받은 사원의 수를 구하는 쿼리문
select count(comm) from emp;

-- 중복 제거를 반영하여 담당업무의 개수를 구하는 쿼리문
select count(distinct job) from emp;

-- 사원 테이블을 부서 번호로 그룹 짓는 쿼리문
-- 그룹 함수를 쓰되, 어떤 컬럼값을 기준으로 그룹 함수를 적용할지 기술
select deptno from emp group by deptno;

-- 소속 부서별 평균 급여를 구하는 쿼리문
select deptno, trunc(avg(sal)) as 평균급여 from emp group by deptno;
--select deptno, ename, avg(sal) from emp group by deptno;
SELECT DEPTNO, SUM(SAL), AVG(SAL) FROM EMP GROUP BY DEPTNO;

-- 소속 부서별 급여 총액과 평균 급여를 구하는 쿼리문
select deptno, sum(sal) as 급여총액, trunc(avg(sal)) as 평균급여
from emp 
group by deptno 
order by deptno asc;

-- 소속 부서별 사원 수와 커미션을 받는 사원의 수를 계산하는 쿼리문
select deptno, 
    count(*) as 부서별사원수, 
    count(comm) as 커미션받는사원수 
from emp 
group by deptno
order by deptno asc;

-- 소속 부서별 평균 급여가 2000 이상인 부서의 번호와 부서별 평균 급여를 출력하는 쿼리문
select deptno, 
    round(avg(sal)) as 평균급여 
from emp 
group by deptno 
having avg(sal) >= 2000;

-- 부서의 최대값과 최소값을 구하되, 최대 급여가 2900 이상인 부서만 출력하는 쿼리문
select deptno,
    max(sal) as 최대급여,
    min(sal) as 최소급여
from emp
group by deptno
having max(sal) >= 2900;

-- cartesian product
select *
from emp, dept;

-- equi join
select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno;

-- 이름(emp.ename)이 BLAKE인 사람들의 부서명(dept.dname)을 출력해보는 쿼리문
select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno
    and emp.ename = 'BLAKE';
    
-- 사원(emp)테이블의 별칭을 E로, 부서(dept)테이블의 별칭을 D로 부여하는 쿼리문
select emp.ename as E, dept.dname as D
from emp, dept
where emp.deptno = dept.deptno;

-- non equil join(비등가 조인)
-- 사원 이름(emp.ename)과 소속 부서명(dept.dname),
-- 급여(emp.sal)의 등급(salgrade.grade)을 출력하는 쿼리문
SELECT E.ENAME, D.DNAME, S.GRADE
FROM EMP E, DEPT D, SALGRADE S 
WHERE E.DEPTNO = D.DEPTNO 
    AND E.SAL BETWEEN S.LOSAL AND S.HISAL
ORDER BY S.GRADE;

-- self join(셀프 조인)
-- 매니저가 누구인지 알아내는 쿼리문
SELECT M.EMPNO||')'||M.ENAME
FROM EMP E, EMP M 
WHERE E.MGR = M.EMPNO
GROUP BY M.ENAME, M.EMPNO;

-- 부서명 조회
select DISTINCT deptno||')'||dname
from dept;

-- 도시 조회
select DISTINCT loc
from dept;

-- 부서 정보 추가
insert into dept 
    (deptno, dname, loc)
values (30, 'SALES', 'CHICAGO');

-- 직원 정보 추가
insert into emp 
    (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1234, 'Hong', 'SALESMAN', 7698, 2020/01/01, 2400, 300, 30);

-- 직원 조회
select e.empno as 사원번호,
    e.ename as 사원이름,
    e.job as 직급,
    nvl(e.mgr, 0) as 상사,
    e.hiredate as 입사일,
    e.sal as 급여,
    nvl(e.comm, 0) as 커미션,
    d.deptno as 부서번호,
    d.dname as 부서이름,
    d.loc as 부서위치
from dept d, emp e
where d.deptno = e.deptno
order by e.ename;

-- 게시글 테이블 추가
create table mvc_board(
    bId number(4) primary key, -- 게시글 번호
    bName varchar2(20), -- 게시글 글쓴이
    bTitle varchar2(100), -- 게시글 제목
    bContent varchar2(300), -- 게시글 내용
    bDate date default sysdate, -- 게시글 날짜
    bHit number(4) default 0, -- 게시글 추천수
    bGroup number(4), -- 게시글 단위 그룹
    bStep number(4), -- 댓글 세로줄 추가
    bIndent number(4) -- 대댓글 가로줄 추가
);
-- 게시글 시퀀스 추가
create sequence mvc_board_seq;
-- 게시글 내용 추가
insert 
    into mvc_board (bId, 
    bName,
    bTitle,
    bContent,
    bHit,
    bGroup,
    bStep,
    bIndent)
values (mvc_board_seq.nextval,
    'abcd',
    'is title',
    'is content',
    0,
    mvc_board_seq.currval,
    0,
    0);
-- 게시글 확인    
select * from mvc_board;
commit;

-- OUTER JOIN
SELECT EMPLOYEE.ENAME||'의 매니저는 '|| MANAGER.ENAME||'입니다.' 
FROM EMP EMPLOYEE, EMP MANAGER 
WHERE EMPLOYEE.MGR = MANAGER.EMPNO(+);

-- CREATE TABLE
CREATE TABLE DEPT02 AS SELECT * -- 컬럼 객체만(로우 x) 복사하여 테이블 생성
FROM DEPT 
WHERE 1=0;

-- INSERT ROW
INSERT INTO DEPT02(DEPTNO, DNAME, LOC)
       VALUES (10, 'ACCOUNTING', 'NEW YORK');
COMMIT; -- 변경된 내용 영구 저장(필수!!!)
SELECT * FROM DEPT02;

-- EMP, DEPT에 있는 모든 내용들을 복사하여 테이블을 생성
CREATE TABLE EMP01 AS SELECT * FROM EMP;
CREATE TABLE dept01 AS SELECT * FROM dept;
commit;
SELECT * from emp01;
SELECT * from dept01;

-- 모든 사원의 부서 번호를 30번으로 수정 후 확인하는 쿼리문
UPDATE emp01 
SET deptno = 30;

-- 사원의 급여를 10% 인상시키는 UPDATE문을 만드는 쿼리문
UPDATE emp01
SET sal = sal + (sal * 0.1);

select * from emp01;

-- 모든 입사일을 오늘로 수정하는 쿼리문
UPDATE emp01
SET hiredate = sysdate;

-- 테이블을 삭제하는 쿼리문
DROP TABLE EMP01;

commit;

-- 부서 번호가 10인 사원의 부서 번호를 40번으로 수정하고 확인하는 쿼리문
UPDATE dept01
SET deptno = 40
WHERE deptno = 10;

SELECT *
FROM emp01;

-- JOB 컬럼값이 MANAGER인 경우, 급여를 10% 인상하는 쿼리문
UPDATE emp01
SET sal = sal * 1.1
WHERE job = 'MANAGER';

-- 1982년에 입사한 사원의 입사일을 오늘로 수정하는 쿼리문
UPDATE emp01
SET hiredate = sysdate
WHERE hiredate BETWEEN '1982-01-01' AND '1982-12-31';

UPDATE emp01
SET hiredate = sysdate
WHERE SUBSTR(hiredate, 1, 2) = '82';

-- SMITH 사원의 부서번호는 20번으로, JOB 컬럼값은 MANAGER로 한꺼번에 수정
UPDATE emp01
SET deptno = 20, job = 'MANAGER'
WHERE empno = 'SMITH';

-- 생성한 DEPT01 부서 테이블의 모든 데이터를 삭제하는 쿼리문
DELETE
FROM dept01;

-- 30번 부서를 삭제하는 쿼리문
DELETE
FROM dept01
WHERE deptno = 30;

SELECT deptno
FROM dept01;

-- DDL을 사용하여 테이블 구조 자체를 생성, 변경, 삭제한다.
CREATE TABLE emp01  (
    empno NUMBER(4),
    ename VARCHAR2(20),
    sal NUMBER(7, 2) -- (최대 정수자리, 최대 소수자리)
);

-- emp01 테이블 job 컬럼 추가
ALTER TABLE emp01 ADD (job VARCHAR2(9));

DESC emp01;

-- 테이블에 이미 존재하는 컬럼을 변경
ALTER TABLE emp01
MODIFY (job VARCHAR(30));

-- emp01 테이블의 job컬럼을 삭제
ALTER TABLE emp01
DROP COLUMN job;

-- 기존 테이블의 존재를 제거한다.(rollback 안되니까 하지마...)
TRUNCATE TABLE emp01; -- 컬럼만 남기고 삭제
DROP TABLE emp01; -- 테이블 자체를 삭제

-- 데이터 자원을 효율적으로 관리하기 위한 시스템 테이블
DESC user_tables;

-- 사원들의 평균 급여보다 더 많은 급여를 받는 사원을 검색하는 쿼리문
SELECT ename, sal
FROM emp
WHERE sal >
    (SELECT AVG(sal)
    FROM emp
    WHERE sal >= 3000);

-- SMITH가 속한 부서의 이름을 검색하는 쿼리문
SELECT d.dname
FROM dept d, emp e
WHERE d.deptno = e.deptno
    AND e.ename = 'SMITH';
    
SELECT dname
FROM dept
WHERE deptno = 
    (SELECT deptno
    FROM emp
    WHERE ename = 'SMITH');

-- 연봉을 3000이상 받는 사원이 소속된 부서와
-- 동일한 부서에서 근무하는 사원들의 정보를 출력하는 쿼리문
SELECT ename, sal, deptno
FROM emp
WHERE deptno IN -- 결과물이 2개 이상일때 IN 키워드로 처리한다.
    (SELECT DISTINCT deptno
    FROM emp
    WHERE sal >= 3000);
    
-- 부서 번호가 30번인 사원들의 급여 중 가장 낮은 값(950)보다
-- 높은 급여를 받는 사원의 이름, 급여를 출력하는 쿼리문
SELECT ename, sal
FROM emp
WHERE sal > ANY (SELECT sal
                 FROM emp
                 WHERE deptno=30);

-- 각 부서의 최대 급여를 받는 사원의 부서코드, 이름, 급여을 출력하는데
-- 부서코드 순으로 오름차순 정렬하여 출력하는 쿼리
SELECT deptno, ename, sal
FROM emp
WHERE sal IN (SELECT MAX(sal) 
              FROM emp
              GROUP BY deptno)
ORDER BY deptno ASC;

-- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다
-- 더 많은 급여를 받는 사람의 이름과 급여를 출력하는 쿼리문
SELECT ename, sal
FROM emp
WHERE sal > ALL(SELECT sal
                FROM emp
                WHERE deptno = 30);
                
-- 이름에 T가 들어가는 사원이 속한 부서에서 근무하는
-- 모든 사원의 사원번호 및 이름을 출력하라.
SELECT deptno, empno, ename
FROM emp
WHERE deptno IN(SELECT deptno
               FROM emp
               WHERE ename LIKE '%T%');
               
-- 매니저(상관)가 KING인 모든 사원의 이름과 급여를 출력하라
SELECT ename, sal
FROM emp
WHERE mgr IN (SELECT empno
              FROM emp
              WHERE ename = 'KING');
              
-- 커미션을 받는 사원과 급여가 일치하는 사원의 이름, 부서번호, 급여를 출력
SELECT ename, deptno, sal
FROM emp
WHERE comm IN (SELECT comm
               FROM emp);
               
-- 자신의 급여가 평균 급여보다 많고 이름에 T가 들어가는 사원과 동일한
-- 부서에 근무하는 모든 사원의 사원 번호, 이름 및 급여를 출력하라.
SELECT AVG(sal)
FROM emp;

SELECT ename, sal
FROM emp
WHERE sal > (SELECT AVG(SAL) FROM emp) AND
      deptno IN (SELECT deptno FROM emp WHERE ename LIKE '%T%');

-- Dallas에서 근무하는 사원과 직업이 일치하는 
-- 사원의 이름, 부서이름 및 급여를 출력하시오 
SELECT e.ename, d.dname, e.sal, e.job, d.loc
FROM dept d, emp e
WHERE d.deptno = e.deptno AND 
    d.loc = 'DALLAS';

SELECT deptno, loc
FROM dept
WHERE loc = 'DALLAS';

SELECT e.ename, d.dname, e.sal, e.job, d.loc
FROM dept d, emp e
WHERE d.deptno = e.deptno AND 
    e.job IN (SELECT loc
             FROM dept
             WHERE loc = 'DALLAS');

-- 상사 직원번호 및 직원명
SELECT '('||manager.empno||')'||manager.ename
FROM emp01 employee, emp01 manager 
WHERE employee.mgr = manager.empno
GROUP BY manager.ename, manager.empno;
-- 부서 번호 및 부서명
SELECT '('||deptno||')'||dname
FROM dept01;
-- 전체 직원 정보 리스트
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc 
FROM dept01 d, emp01 e
WHERE d.deptno = e.deptno AND
             e.mgr IN (SELECT employee.mgr
                       FROM emp01 employee, emp01 manager 
                       WHERE employee.mgr = manager.empno);
                       
select E.empno, E.ename, E.job, E.mgr, E.hiredate, E.sal, E.comm, E.deptno 
from emp E,(select distinct M.ename, M.empno from emp E, emp M where E.mgr = M.empno) M 
where E.empno = M.empno;

SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, NVL(e.comm, 0), d.deptno, d.dname, d.loc FROM dept01 d, emp01 e WHERE d.deptno = e.deptno AND e.mgr IN (SELECT employee.mgr FROM emp01 employee, emp01 manager WHERE employee.mgr = manager.empno)