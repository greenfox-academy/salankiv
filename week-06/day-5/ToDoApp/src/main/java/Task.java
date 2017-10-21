import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
	private static int taskCounter;

	public String name;
	public int id;
	public LocalDateTime createdDate;
	public LocalDateTime completedDate;

	public Task(String name) {
		this.name = name;
		taskCounter++;
		id = taskCounter;
		createdDate = LocalDateTime.now();
		completedDate = LocalDateTime.now();
	}

	public Task(String name, int id, LocalDateTime createdDate, LocalDateTime completedDate) {
		this.name = name;
		this.id = id;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
	}

	public void setCompleted() {
		completedDate = LocalDateTime.now();
	}

	public int completionTime() {
		return LocalDate.now().getDayOfYear() - completedDate.getDayOfYear();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public LocalDateTime getCompletedDate() {
		return completedDate;
	}
}
