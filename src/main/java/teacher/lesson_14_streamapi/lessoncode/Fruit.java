package teacher.lesson_14_streamapi.lessoncode;

public class Fruit {

	private String title;
	private String color;
	private int weight;

	public Fruit(String title, String color, int weight) {
		this.title = title;
		this.color = color;
		this.weight = weight;
	}

	public String getTitle() {
		return title;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Fruit{" +
				"title='" + title + '\'' +
				", color='" + color + '\'' +
				", weight=" + weight +
				'}';
	}
}
