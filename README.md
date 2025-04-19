# 📝 Todo Application

A simple and elegant Todo List web application built using **Spring Boot**, **Thymeleaf**, and **Bootstrap**. Users can add tasks, toggle their completion status, and delete tasks dynamically from a clean and responsive UI.

## 🌟 Features

- ✅ Add new tasks
- 🔁 Toggle tasks between completed and not completed
- ❌ Delete tasks
- 🎨 Responsive Bootstrap UI
- ⚙️ MVC architecture using Spring Boot
- 🧠 Server-side rendering using Thymeleaf

## 🖼️ Application Screenshots

### 1. Main UI
Displays all current tasks with options to toggle or delete.
![Todo Application Main UI]# 📝 Todo Application

A simple and elegant Todo List web application built using **Spring Boot**, **Thymeleaf**, and **Bootstrap**. Users can add tasks, toggle their completion status, and delete tasks dynamically from a clean and responsive UI.

## 🌟 Features

- ✅ Add new tasks
- 🔁 Toggle tasks between completed and not completed
- ❌ Delete tasks
- 🎨 Responsive Bootstrap UI
- ⚙️ MVC architecture using Spring Boot
- 🧠 Server-side rendering using Thymeleaf

## 🖼️ Application Screenshots

### 1. Main UI
Displays all current tasks with options to toggle or delete.
![Todo Application Main UI]![image](https://github.com/user-attachments/assets/16a8ea05-dc02-4a69-8b10-a10b19fbd03f)

### 2. Toggled Tasks
Toggled tasks appear with a strike-through.
![Toggled Task Example]![image](https://github.com/user-attachments/assets/e39a5b1d-0804-41f2-aa64-f18a9e7e6849)


### 3. Deleted Tasks
Tasks are removed instantly after clicking the "Delete" button.
![Deleted Tasks]![image](https://github.com/user-attachments/assets/c3b56a44-dac4-42bf-92c6-0f5a6888df4d)



## 📁 Project Structure
src ├── main │ ├── java │ │ └── com.app.todoapp │ │ ├── controller │ │ │ └── TaskController.java │ │ ├── models │ │ │ └── Task.java │ │ ├── repository │ │ │ └── TaskRepository.java │ │ └── service │ │ └── TaskService.java │ └── resources │ ├── templates │ │ └── tasks.html │ └── static │ └── (CSS/JS if needed) └── test

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven or Gradle
- (Optional) IntelliJ IDEA / VSCode

### Steps to Run

```bash
# Clone the repository
git clone https://github.com/your-username/todo-app-springboot.git
cd todo-app-springboot

# Build and run the application
./mvnw spring-boot:run
@GetMapping
public String getTask(Model model)

@PostMapping
public String createTask(@RequestParam String title)

@GetMapping("/{id}/delete")
public String deleteTask(@PathVariable Long id)

@GetMapping("/{id}/toggle")
public String toggleTask(@PathVariable Long id)
🧪 Future Enhancements
Add task categories or priority

Persist data using MySQL or PostgreSQL

Add user authentication

Use JavaScript for AJAX-based toggling/deleting
