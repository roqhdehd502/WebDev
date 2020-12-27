package thirdWeek.rec;

public class BMI {
	private double height, weight;
	
	public BMI(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	private double sndWei() { // 표준체중 계산 메소드
		return (height - 100) * 0.9;
	}
	
	public void show() {
		System.out.println("당신의 표준체중은 " + Math.round(sndWei()) + "kg 으로");
		
		if (weight == sndWei()) {
			System.out.println("표준 체중 입니다.");
		} else if (weight > sndWei()) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("저체중 입니다.");
		}
	}
}