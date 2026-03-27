INSERT INTO department (name)
       VALUES
         ('HR'),
         ('IT'),
         ('Finance');



INSERT INTO employee(name , email , position , dept_id)
    VALUES
        ('Rahul Sharma',  'rahul@gmail.com',  'Manager',          1),
        ('Priya Singh',   'priya@gmail.com',  'Developer',        2),
        ('Amit Kumar',    'amit@gmail.com',   'Analyst',          3),
        ('Sneha Verma',   'sneha@gmail.com',  'HR Executive',     1),
        ('Raj Patel',     'raj@gmail.com',    'Senior Developer', 2);


INSERT INTO users(username , password)
    VALUES
        ('Kunal' , '$2a$12$2Ld6tvVVbiao/YdIc578EuEqE5QzIOvyBR/OUmUM2..MNXspFQNgK'),
        ('Varun' , '$2a$12$sQIeahul2c4b24THToXrtOQ3zuDvtUcQs/YbZ7g85BXV7XhxLmH9a'),
        ('Ayushi' , '$2a$12$w7sZJHRRSY/BpsVVDMNw4eOvVlF0Hyus7zC/yC9lG1Z.1ShSEkzjW');