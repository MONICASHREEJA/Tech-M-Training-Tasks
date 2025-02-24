let student = {
    name: "Rohinee",
    age: 20,
    course: "Computer Science",
    
  
    displayInfo: function() {
        console.log(`Name: ${this.name}, Age: ${this.age}, Course: ${this.course}`);
    }
};


console.log("Initial Student Object:");
student.displayInfo();

student.address = {
    city: "Chennai",
    zip: "600123"
};

student.updateCourse = function(newCourse) {
    this.course = newCourse;
    console.log(`Course updated to: ${this.course}`);
};

student.greet = function() {
    console.log(`Hello, ${this.name}! Welcome to the course.`);
};

console.log("\nAfter Adding Nested Object and Functions:");
student.displayInfo();
console.log(`Address: ${student.address.city}, ZIP: ${student.address.zip}`);
student.updateCourse("Machine Learning");
student.greet();

delete student.age;
delete student.greet;


console.log("\nAfter Removing Property and Function:");
console.log(student);
student.displayInfo();
