class User:
    def __init__(self, username, email):
        self._username = username
        self._email = email

    def displayInfo(self):
        print(f"Username: {self._username}")
        print(f"Email: {self._email}")

    def getUsername(self):
        return self._username  # Return the username

    def getEmail(self):
        return self._email  # Return the email


class Student(User):
    def __init__(self, username, email, studentId, course):
        super().__init__(username, email)
        self._studentId = studentId
        self._course = course

    def displayInfo(self):
        super().displayInfo()  # Call User's displayInfo method
        print(f"Student ID: {self._studentId}")
        print(f"Course: {self._course}")

    def getStudentId(self):
        return self._studentId  # Return the student ID

    def getCourse(self):
        return self._course  # Return the course


class Employee(User):
    def __init__(self, username, email, employeeId, department):
        super().__init__(username, email)
        self._employeeId = employeeId
        self._department = department

    def displayInfo(self):
        super().displayInfo()  # Call User's displayInfo method
        print(f"Employee ID: {self._employeeId}")
        print(f"Department: {self._department}")

    def getEmployeeId(self):
        return self._employeeId  # Return the employee ID

    def getDepartment(self):
        return self._department  # Return the department


def main():
    # Creating a User instance
    user1 = User("john_doe", "john.doe@example.com")
    user1.displayInfo()
    print()

    # Creating a Student instance
    student1 = Student("alice_smith", "alice.smith@student.com", "S12345", "Computer Science")
    student1.displayInfo()
    print(f"Student's Username: {student1.getUsername()}")
    print(f"Student's Email: {student1.getEmail()}")
    print(f"Student's ID: {student1.getStudentId()}")
    print(f"Student's Course: {student1.getCourse()}")
    print()

    # Creating an Employee instance
    employee1 = Employee("bob_jones", "bob.jones@company.com", "E67890", "Engineering")
    employee1.displayInfo()
    print(f"Employee's Username: {employee1.getUsername()}")
    print(f"Employee's Email: {employee1.getEmail()}")
    print(f"Employee's ID: {employee1.getEmployeeId()}")
    print(f"Employee's Department: {employee1.getDepartment()}")


if __name__ == "__main__":
    main()
