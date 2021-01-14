-- dept ���̺��� ���� ���
desc dept;

-- dept ���̺��� ��� �÷� ���
select * from dept;

-- emp ���̺��� empno �÷� ���
select EMPNO from EMP;

-- emp ���̺��� sal�� ������ 3000 �ʰ��� ��� �÷� ���
select * from emp where sal > 3000;

-- emp ���̺��� sal�� ������ 3000 ������ ��� �÷� ���
select * from emp where sal <= 3000;

-- emp ���̺��� ename, sal �׸��� sal ������ 100�� ���� �÷� ���
select ename, sal, sal+100 from emp;

-- emp ���̺��� deptno�� 20�� ��� �÷� ���
select * from emp where deptno = 20;

-- emp ���̺��� deptno�� 20�� �ƴ� ��� �÷� ���
select * from emp where deptno != 20;
select * from emp where deptno <> 20;
select * from emp where not deptno = 20;

-- �̸�(ENAME)�� FORD�� ����� ���(empno), �̸�(ename), �޿�(SAL)�� ����ϴ� ������
select empno, ename, sal from emp where ename = 'FORD';

-- 1982�� 1�� 1�� ���Ŀ� �Ի��� ����� ����ϴ� ������
select ename from emp where hiredate >= date '1982-01-01';
select ename from emp where hiredate >= date '1982.01.01';
select ename from emp where hiredate >= date '1982/01/01';

-- job�� MANAGER�̰� 10�� �μ� ����� ����ϴ� ������
select ename from emp where job = 'MANAGER' AND deptno = 10;

-- job�� MANAGER �̰ų� 10�� �μ��� ���
select ename from emp where job = 'MANAGER' OR deptno = 10;

-- 10�� �μ��� �ƴ� ���
select ename from emp where not deptno = 10;

-- �޿��� 2000~3000 ������ ����� �˻��ϴ� ������
select ename from emp where sal >= 2000 AND sal <= 3000;
select ename from emp where sal between 2000 and 3000;

-- �޿��� 2000 �̸��̰ų� 3000 �ʰ��� ����� �˻��ϴ� ������
select ename from emp where sal < 2000 OR sal > 3000;
select ename from emp where sal not between 2000 and 3000;

-- 1987�⿡ �Ի��� ����� ����ϴ� ������
select ename from emp where hiredate between '1987-01-01' and '1987-12-31';

-- Ŀ�̼�(COMM)�� 300 Ȥ�� 500 Ȥ�� 1400�� ����� �ִ��� �˻��ϴ� ������
select ename from emp where comm = 300 OR comm = 500 OR comm = 1400;
select ename from emp where comm in (300, 500, 1400);

-- Ŀ�̼�(COMM)�� 300 Ȥ�� 500 Ȥ�� 1400�� �ƴ� ����� �ִ��� �˻��ϴ� ������
select ename from emp where comm not in (300, 500, 1400);

-- �̸��� F�� �����ϴ� ����� ã�� ������
select ename from emp where ename LIKE 'F%';

-- ��ġ ��� ���� �̸� �߿� A�� ����ִ� ����� ã�� ������
select * from emp where ename LIKE '%A%';

-- �̸��� N���� ������ ����� ã�� ������
select * from emp where ename LIKE '%N';

-- �̸��� �� ��° ���ڰ� A�� ����� ã�� ������
select * from emp where ename LIKE '_A%';

-- �̸��� �� ��° ���ڰ� A�� ����� ã�� ������
select * from emp where ename LIKE '__A%';

-- �̸��� A�� �������� �ʴ� ����� ã�� ������
select * from emp where ename not LIKE '%A%';

-- ����Ŭ�� �÷��� NULL���� ����Ǵ� ���� ����Ѵ�.
-- �ֳ��ϸ� null�� ����Ǿ� �ִ� ��쿡�� =�����ڷ� �Ǵ��� �� ���� �����̴�.
-- ���� �ش� ������ null ������ �ùٸ� ���� �ƴϴ�.
select ename, job, comm from emp where comm=null;

-- is null
select * from emp where comm is null;

-- is not null
select * from emp where comm is not null;

-- ������� �޿��� ������������ �����ϴ� ������
select * from emp order by sal asc;

-- ���� �ֱٿ� �Ի��� ������� ����ϴ� ������
select * from emp order by hiredate desc;

-- ����� �̸��� ����������� ����ϴ� ������
select * from emp order by ename asc;

-- ������� �ҼӵǾ� �ִ� �μ��� ��ȣ�� ����ϴ� ������
select distinct deptno from emp;

-- ������� �ҼӵǾ� �ִ� JOB�� �������� ����ϴ� ������
select DISTINCT job from emp;

-- ����� ename �÷��� "�̸�"�̶� �÷������� ����ϴ� ������
SELECT ename as "�̸�" from emp;

-- ������� �̸��� ������ ����ϴ� ������(comm�� NULL�̸� 0���� ó��)
select ename, sal*12 + NVL(comm, 0) "����" from emp;

-- �� �÷��� �Ӽ����� ' is a '��� ������ ���� �����ϴ� ������
select ename || ' is a ' || job "�������� ��" from emp;

-- ��� ������ ����� �� �ٷ� ��� ���ؼ� ����Ŭ���� �����ϴ� ���̺�
select 24*60 from dual;

-- ����Ŭ ���� ���̺�(dual)���� ���밪(abs) ��� 
select -10, abs(-10) from dual;

-- ������ ���� �ĺ��� �۰ų� ���� �ִ� ������ ��ȯ
select 34.5432, floor(34.5432) from dual;

-- �Ҽ��� �ݿø�
select 34.5432, round(34.5432) from dual;
-- �Ҽ��� �ݿø�(�������� ���� �ڸ� ��, ������� �Ҽ��� �ڸ� ��)
select 34.5432, round(34.5432, 2) from dual;
select 34.5432, round(34.5432, -1) from dual;

-- �Ҽ��� ����
select 34.5432, trunc(34.5432) from dual;
-- �Ҽ��� ����(�������� ���� �ڸ���, 0�� �Ҽ�, ����� �Ҽ��� �ڸ� ��)
select 34.5432, trunc(34.5432, 0) from dual;
select 34.5432, trunc(34.5432, -1) from dual;

-- �������� ������(%)
SELECT mod(27,2) from dual;

-- ���ڸ� ��/�ҹ��ڷ� ����
select upper('Welcome to Oracle') from dual;
select lower('Welcome to Oracle') from dual;

-- �̴ϼȸ� �빮�ڷ� ��ȯ
select initcap('Welcome to Oracle') from dual;

-- ������ ����
select length('oracle') from dual;

-- ������ ����Ʈ ũ��
select lengthb('oracle') from dual;

-- ã���� �ϴ� ���� Ű������ ��ġ(����Ŭ�� �ε����� 0�� �ƴ� 1���� ����)
select instr('Welcome to Oracle', 'O') from dual;

-- �ε��� 4���� �����ؼ� ���� 3�� �����̽�
select substr('Welcome to Oracle', 4, 3) from dual;

-- ������� �Ի��Ͽ��� �Ի� �⵵�� �Ի� ���� ����ϴ� ������
select ename, 19||substr(hiredate, 1, 2)�⵵, substr(hiredate, 4, 2)�� from emp;

-- 9���� �Ի��� ����� ����ϴ� ������
select ename, 19||hiredate from emp where substr(hiredate, 4, 2) = '09';

-- 20���� �ڸ��� ������ �� ��� ���ڿ��� ����ϰ�,
-- ����/�����ʿ� ���� �� ������ '#' ��ȣ�� ä��� ������
select lpad('oracle', 20, '#') from dual;
select rpad('oracle', 20, '#') from dual;

-- �ش� ���ڿ����� ������ Ű���常 �߶󳻼� ����ϴ� ������
select trim('a' from 'aaaaORACLEaaaaa') from dual;
select trim(' ORACLE ') from dual;

-- ����Ŭ ���� ���̺�(dual)���� ��¥(sysdate) ���
select sysdate from dual;
select sysdate-1 ����, sysdate ����, sysdate+1 ���� from dual;

-- �� �������� �ٹ��� ���� ���� ���ϴ� ������(months_between)
select ename, sysdate, hiredate, months_between(sysdate, hiredate) �ٹ������� from emp;
select ename, sysdate, hiredate, trunc(months_between(sysdate, hiredate)) �ٹ������� from emp;

-- �Ի� ��¥���� 4������ �߰��� ������� ��Ÿ���� ������(add_month)
select ename, hiredate, add_months(hiredate, 4) from emp;

-- ������ �������� ���� ����� ���� �������� �������� �˾ƺ��� ������(next_day)
select sysdate, next_day(sysdate, '������') from dual;

-- �ش� ���� ������ ��¥�� ��ȯ(last_day)
select hiredate, last_day(hiredate) from emp;

-- ��¥�� Ȥ�� �������� ���������� ��ȯ
select sysdate, to_char(sysdate, 'YYYY-MM-DD') from dual;

-- ������� �Ի����� ����ϵ�, ���ϱ��� �Բ� ����ϴ� ������
select hiredate, to_char(hiredate, 'YYYY/MM/DD DAY') from emp;

-- ���� ��¥�� �ð��� ����ϴ� ������
select to_char(sysdate, 'YYYY/MM/DD, HH24:MI:SS') from dual;

-- �� ������ ��ȭ ��ȣ�� �տ� ���̰�
-- õ �������� �޸��� �ٿ��� ����ϴ� ������ (��: \1,230,000)
select ename, sal, to_char(sal, 'L999,999') from emp;

-- �������� ��¥������ ��ȯ�ϴ� �Լ�.
select ename, hiredate from emp where hiredate=to_date(19810220, 'YYYYMMDD');

-- ���� ��ĥ�� �������� ���� ��¥���� 2016/01/01�� �� ���
select trunc(sysdate - to_date('2016/01/01', 'YYYY/MM/DD')) from dual;

-- to_number(���������� ���������� ��ȯ)
select to_number('20,000', '99,999') - to_number('10,000', '99,999') from dual;

-- null�� �ٸ� ������ ��ȯ�ϴ� nvl �Լ�
select ename, sal, nvl(comm, 0), job from emp order by job;

-- decode �Լ�(java�� switch~case���� ���� ���)
-- ����� �μ� ��ȣ�� �̸����� �����ϴ� ������
select deptno, decode(deptno, 10, 'A', 20, 'B', 'DEFAULT') from emp order by deptno;
select ename, deptno, decode(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS') as DNAME from emp;

-- ���ǿ� ���� ���� �ٸ� ó���� ������ case �Լ�
-- (java�� if~else���� ���� ���)
-- decode �Լ��� ������ ��ġ(�񱳿�����)�ϴ� ��쿡�� ����������
-- case �Լ��� �پ��� �� �����ڸ� �����Ͽ� ���� �� ������ ������ �� �ִ�.
select ename, deptno,
    case when deptno=10 then 'ACCOUNTING'
         when deptno=20 then 'RESEARCH'
         when deptno=30 then 'SALES'
         when deptno=40 then 'OPERATIONS'
    end as DNAME from emp;
    
-- �� �޿��� ���ϴ� ������
select count(*) from emp;
select sum(sal) from emp;

-- �޿� ����� ���ϴ� ������
select trunc(avg(sal)) from emp;

-- ���� ���� �޿��� ���� ���� �޿��� ���ϴ� ������
select min(sal), max(sal) from emp;

-- ��� ���̺��� ����� �߿��� Ŀ�̼�(comm)�� ���� ����� ���� ���ϴ� ������
select count(comm) from emp;

-- �ߺ� ���Ÿ� �ݿ��Ͽ� �������� ������ ���ϴ� ������
select count(distinct job) from emp;

-- ��� ���̺��� �μ� ��ȣ�� �׷� ���� ������
-- �׷� �Լ��� ����, � �÷����� �������� �׷� �Լ��� �������� ���
select deptno from emp group by deptno;

-- �Ҽ� �μ��� ��� �޿��� ���ϴ� ������
select deptno, trunc(avg(sal)) as ��ձ޿� from emp group by deptno;
--select deptno, ename, avg(sal) from emp group by deptno;
SELECT DEPTNO, SUM(SAL), AVG(SAL) FROM EMP GROUP BY DEPTNO;

-- �Ҽ� �μ��� �޿� �Ѿװ� ��� �޿��� ���ϴ� ������
select deptno, sum(sal) as �޿��Ѿ�, trunc(avg(sal)) as ��ձ޿�
from emp 
group by deptno 
order by deptno asc;

-- �Ҽ� �μ��� ��� ���� Ŀ�̼��� �޴� ����� ���� ����ϴ� ������
select deptno, 
    count(*) as �μ��������, 
    count(comm) as Ŀ�̼ǹ޴»���� 
from emp 
group by deptno
order by deptno asc;

-- �Ҽ� �μ��� ��� �޿��� 2000 �̻��� �μ��� ��ȣ�� �μ��� ��� �޿��� ����ϴ� ������
select deptno, 
    round(avg(sal)) as ��ձ޿� 
from emp 
group by deptno 
having avg(sal) >= 2000;

-- �μ��� �ִ밪�� �ּҰ��� ���ϵ�, �ִ� �޿��� 2900 �̻��� �μ��� ����ϴ� ������
select deptno,
    max(sal) as �ִ�޿�,
    min(sal) as �ּұ޿�
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

-- �̸�(emp.ename)�� BLAKE�� ������� �μ���(dept.dname)�� ����غ��� ������
select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno
    and emp.ename = 'BLAKE';
    
-- ���(emp)���̺��� ��Ī�� E��, �μ�(dept)���̺��� ��Ī�� D�� �ο��ϴ� ������
select emp.ename as E, dept.dname as D
from emp, dept
where emp.deptno = dept.deptno;

-- non equil join(�� ����)
-- ��� �̸�(emp.ename)�� �Ҽ� �μ���(dept.dname),
-- �޿�(emp.sal)�� ���(salgrade.grade)�� ����ϴ� ������
SELECT E.ENAME, D.DNAME, S.GRADE
FROM EMP E, DEPT D, SALGRADE S 
WHERE E.DEPTNO = D.DEPTNO 
    AND E.SAL BETWEEN S.LOSAL AND S.HISAL
ORDER BY S.GRADE;

-- self join(���� ����)
-- �Ŵ����� �������� �˾Ƴ��� ������
SELECT M.EMPNO||')'||M.ENAME
FROM EMP E, EMP M 
WHERE E.MGR = M.EMPNO
GROUP BY M.ENAME, M.EMPNO;

-- �μ��� ��ȸ
select DISTINCT deptno||')'||dname
from dept;

-- ���� ��ȸ
select DISTINCT loc
from dept;

-- �μ� ���� �߰�
insert into dept 
    (deptno, dname, loc)
values (30, 'SALES', 'CHICAGO');

-- ���� ���� �߰�
insert into emp 
    (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1234, 'Hong', 'SALESMAN', 7698, 2020/01/01, 2400, 300, 30);

-- ���� ��ȸ
select e.empno as �����ȣ,
    e.ename as ����̸�,
    e.job as ����,
    nvl(e.mgr, 0) as ���,
    e.hiredate as �Ի���,
    e.sal as �޿�,
    nvl(e.comm, 0) as Ŀ�̼�,
    d.deptno as �μ���ȣ,
    d.dname as �μ��̸�,
    d.loc as �μ���ġ
from dept d, emp e
where d.deptno = e.deptno
order by e.ename;

-- �Խñ� ���̺� �߰�
create table mvc_board(
    bId number(4) primary key, -- �Խñ� ��ȣ
    bName varchar2(20), -- �Խñ� �۾���
    bTitle varchar2(100), -- �Խñ� ����
    bContent varchar2(300), -- �Խñ� ����
    bDate date default sysdate, -- �Խñ� ��¥
    bHit number(4) default 0, -- �Խñ� ��õ��
    bGroup number(4), -- �Խñ� ���� �׷�
    bStep number(4), -- ��� ������ �߰�
    bIndent number(4) -- ���� ������ �߰�
);
-- �Խñ� ������ �߰�
create sequence mvc_board_seq;
-- �Խñ� ���� �߰�
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
-- �Խñ� Ȯ��    
select * from mvc_board;
commit;

-- OUTER JOIN
SELECT EMPLOYEE.ENAME||'�� �Ŵ����� '|| MANAGER.ENAME||'�Դϴ�.' 
FROM EMP EMPLOYEE, EMP MANAGER 
WHERE EMPLOYEE.MGR = MANAGER.EMPNO(+);

-- CREATE TABLE
CREATE TABLE DEPT02 AS SELECT * -- �÷� ��ü��(�ο� x) �����Ͽ� ���̺� ����
FROM DEPT 
WHERE 1=0;

-- INSERT ROW
INSERT INTO DEPT02(DEPTNO, DNAME, LOC)
       VALUES (10, 'ACCOUNTING', 'NEW YORK');
COMMIT; -- ����� ���� ���� ����(�ʼ�!!!)
SELECT * FROM DEPT02;

-- EMP, DEPT�� �ִ� ��� ������� �����Ͽ� ���̺��� ����
CREATE TABLE EMP01 AS SELECT * FROM EMP;
CREATE TABLE dept01 AS SELECT * FROM dept;
commit;
SELECT * from emp01;
SELECT * from dept01;

-- ��� ����� �μ� ��ȣ�� 30������ ���� �� Ȯ���ϴ� ������
UPDATE emp01 
SET deptno = 30;

-- ����� �޿��� 10% �λ��Ű�� UPDATE���� ����� ������
UPDATE emp01
SET sal = sal + (sal * 0.1);

select * from emp01;

-- ��� �Ի����� ���÷� �����ϴ� ������
UPDATE emp01
SET hiredate = sysdate;

-- ���̺��� �����ϴ� ������
DROP TABLE EMP01;

commit;

-- �μ� ��ȣ�� 10�� ����� �μ� ��ȣ�� 40������ �����ϰ� Ȯ���ϴ� ������
UPDATE dept01
SET deptno = 40
WHERE deptno = 10;

SELECT *
FROM emp01;

-- JOB �÷����� MANAGER�� ���, �޿��� 10% �λ��ϴ� ������
UPDATE emp01
SET sal = sal * 1.1
WHERE job = 'MANAGER';

-- 1982�⿡ �Ի��� ����� �Ի����� ���÷� �����ϴ� ������
UPDATE emp01
SET hiredate = sysdate
WHERE hiredate BETWEEN '1982-01-01' AND '1982-12-31';

UPDATE emp01
SET hiredate = sysdate
WHERE SUBSTR(hiredate, 1, 2) = '82';

-- SMITH ����� �μ���ȣ�� 20������, JOB �÷����� MANAGER�� �Ѳ����� ����
UPDATE emp01
SET deptno = 20, job = 'MANAGER'
WHERE empno = 'SMITH';

-- ������ DEPT01 �μ� ���̺��� ��� �����͸� �����ϴ� ������
DELETE
FROM dept01;

-- 30�� �μ��� �����ϴ� ������
DELETE
FROM dept01
WHERE deptno = 30;

SELECT deptno
FROM dept01;

-- DDL�� ����Ͽ� ���̺� ���� ��ü�� ����, ����, �����Ѵ�.
CREATE TABLE emp01  (
    empno NUMBER(4),
    ename VARCHAR2(20),
    sal NUMBER(7, 2) -- (�ִ� �����ڸ�, �ִ� �Ҽ��ڸ�)
);

-- emp01 ���̺� job �÷� �߰�
ALTER TABLE emp01 ADD (job VARCHAR2(9));

DESC emp01;

-- ���̺� �̹� �����ϴ� �÷��� ����
ALTER TABLE emp01
MODIFY (job VARCHAR(30));

-- emp01 ���̺��� job�÷��� ����
ALTER TABLE emp01
DROP COLUMN job;

-- ���� ���̺��� ���縦 �����Ѵ�.(rollback �ȵǴϱ� ������...)
TRUNCATE TABLE emp01; -- �÷��� ����� ����
DROP TABLE emp01; -- ���̺� ��ü�� ����

-- ������ �ڿ��� ȿ�������� �����ϱ� ���� �ý��� ���̺�
DESC user_tables;

-- ������� ��� �޿����� �� ���� �޿��� �޴� ����� �˻��ϴ� ������
SELECT ename, sal
FROM emp
WHERE sal >
    (SELECT AVG(sal)
    FROM emp
    WHERE sal >= 3000);

-- SMITH�� ���� �μ��� �̸��� �˻��ϴ� ������
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

-- ������ 3000�̻� �޴� ����� �Ҽӵ� �μ���
-- ������ �μ����� �ٹ��ϴ� ������� ������ ����ϴ� ������
SELECT ename, sal, deptno
FROM emp
WHERE deptno IN -- ������� 2�� �̻��϶� IN Ű����� ó���Ѵ�.
    (SELECT DISTINCT deptno
    FROM emp
    WHERE sal >= 3000);
    
-- �μ� ��ȣ�� 30���� ������� �޿� �� ���� ���� ��(950)����
-- ���� �޿��� �޴� ����� �̸�, �޿��� ����ϴ� ������
SELECT ename, sal
FROM emp
WHERE sal > ANY (SELECT sal
                 FROM emp
                 WHERE deptno=30);

-- �� �μ��� �ִ� �޿��� �޴� ����� �μ��ڵ�, �̸�, �޿��� ����ϴµ�
-- �μ��ڵ� ������ �������� �����Ͽ� ����ϴ� ����
SELECT deptno, ename, sal
FROM emp
WHERE sal IN (SELECT MAX(sal) 
              FROM emp
              GROUP BY deptno)
ORDER BY deptno ASC;

-- 30�� �Ҽ� ����� �߿��� �޿��� ���� ���� �޴� �������
-- �� ���� �޿��� �޴� ����� �̸��� �޿��� ����ϴ� ������
SELECT ename, sal
FROM emp
WHERE sal > ALL(SELECT sal
                FROM emp
                WHERE deptno = 30);
                
-- �̸��� T�� ���� ����� ���� �μ����� �ٹ��ϴ�
-- ��� ����� �����ȣ �� �̸��� ����϶�.
SELECT deptno, empno, ename
FROM emp
WHERE deptno IN(SELECT deptno
               FROM emp
               WHERE ename LIKE '%T%');
               
-- �Ŵ���(���)�� KING�� ��� ����� �̸��� �޿��� ����϶�
SELECT ename, sal
FROM emp
WHERE mgr IN (SELECT empno
              FROM emp
              WHERE ename = 'KING');
              
-- Ŀ�̼��� �޴� ����� �޿��� ��ġ�ϴ� ����� �̸�, �μ���ȣ, �޿��� ���
SELECT ename, deptno, sal
FROM emp
WHERE comm IN (SELECT comm
               FROM emp);
               
-- �ڽ��� �޿��� ��� �޿����� ���� �̸��� T�� ���� ����� ������
-- �μ��� �ٹ��ϴ� ��� ����� ��� ��ȣ, �̸� �� �޿��� ����϶�.
SELECT AVG(sal)
FROM emp;

SELECT ename, sal
FROM emp
WHERE sal > (SELECT AVG(SAL) FROM emp) AND
      deptno IN (SELECT deptno FROM emp WHERE ename LIKE '%T%');

-- Dallas���� �ٹ��ϴ� ����� ������ ��ġ�ϴ� 
-- ����� �̸�, �μ��̸� �� �޿��� ����Ͻÿ� 
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

-- ��� ������ȣ �� ������
SELECT '('||manager.empno||')'||manager.ename
FROM emp01 employee, emp01 manager 
WHERE employee.mgr = manager.empno
GROUP BY manager.ename, manager.empno;
-- �μ� ��ȣ �� �μ���
SELECT '('||deptno||')'||dname
FROM dept01;
-- ��ü ���� ���� ����Ʈ
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