package com.example.kokom.ui.utils

object CommonUtils {
    const val DATA = """[
            {
                "index": 44,
                "title": "Ethics in Technology",
                "date": "2023-07-20",
                "description": "Explore the ethical considerations in technology and their implications."
              },
              {
                "index": 29,
               "title": "Content Management Systems Explained",
               "date": "2022-04-25",
               "description": "An overview of popular content management systems and their use cases."
             },
             {
               "index": 38,
               "title": "Understanding Cryptocurrency",
               "date": "2023-01-22",
               "description": "Learn the basics of cryptocurrency and how it works."
             },
             {
               "index": 1,
               "title": "Introduction to JSON",
               "date": "2024-01-15",
               "description": "This article provides an overview of JSON, its structure, and how to use it in web applications."
             },
             {
               "index": 7,
               "title": "Version Control with Git",
               "date": "2024-07-19",
               "description": "Learn the basics of Git and how to manage your code effectively."
             },
             {
               "index": 49,
               "title": "The Impact of Social Media",
               "date": "2023-11-28",
               "description": "Explore the influence of social media on society and communication."
             },
             {
               "index": 35,
               "title": "Getting Started with Swift",
               "date": "2022-10-05",
               "description": "An introductory guide to Swift for iOS app development."
             },
             {
               "index": 12,
               "title": "Working with MongoDB",
               "date": "2024-10-20",
               "description": "Learn how to use MongoDB for storing and retrieving data in your applications."
             },
             {
               "index": 41,
               "title": "Exploring 5G Technology",
               "date": "2023-04-12",
               "description": "An introduction to 5G technology and its potential impact on communication."
             },
             {
               "index": 24,
               "title": "Machine Learning Basics",
               "date": "2024-10-10",
               "description": "An introduction to machine learning concepts and algorithms."
             },
             {
               "index": 39,
               "title": "The Role of Data Science",
               "date": "2023-02-19",
               "description": "An overview of data science and its importance in decision-making."
             },
             {
               "index": 2,
               "title": "Understanding APIs",
               "date": "2024-02-10",
               "description": "Learn what APIs are and how they enable communication between different software systems."
             },
             {
               "index": 30,
               "title": "Digital Marketing Strategies",
               "date": "2022-05-30",
               "description": "Explore various digital marketing strategies to reach your audience effectively."
             },
             {
               "index": 3,
               "title": "JavaScript Basics",
               "date": "2024-03-25",
               "description": "An introductory guide to JavaScript, covering variables, functions, and control structures."
             },
             {
               "index": 40,
               "title": "Creating Interactive Web Experiences",
               "date": "2023-03-15",
               "description": "Learn how to create engaging and interactive experiences on the web."
             },
             {
               "index": 18,
               "title": "Introduction to SQL",
               "date": "2024-05-30",
               "description": "A beginner's guide to SQL for managing and querying databases."
             },
             {
               "index": 32,
               "title": "Understanding E-commerce Platforms",
               "date": "2022-07-10",
               "description": "Explore different e-commerce platforms and how to choose the right one for your business."
             },
             {
               "index": 14,
               "title": "Introduction to TypeScript",
               "date": "2024-09-30",
               "description": "Learn about TypeScript, a typed superset of JavaScript that compiles to plain JavaScript."
             },
             {
               "index": 15,
               "title": "Getting Started with Docker",
               "date": "2024-08-22",
               "description": "An introduction to Docker and how it simplifies application deployment."
             },
             {
               "index": 45,
               "title": "Understanding Internet of Things (IoT)",
               "date": "2023-08-14",
               "description": "Learn about IoT and its impact on everyday life."
             },
             {
               "index": 4,
               "title": "CSS Flexbox Guide",
               "date": "2024-04-02",
               "description": "Explore the Flexbox layout model and how it simplifies responsive design."
             },
             {
               "index": 27,
               "title": "The Importance of SEO",
               "date": "2022-02-15",
               "description": "Learn about search engine optimization and how to improve website visibility."
             },
             {
               "index": 43,
               "title": "The Basics of Game Development",
               "date": "2023-06-30",
               "description": "An introduction to the fundamental concepts of game development."
             },
             {
               "index": 34,
               "title": "Exploring Augmented Reality",
               "date": "2022-09-12",
               "description": "Learn about augmented reality and its applications in various industries."
             },
             {
               "index": 31,
               "title": "Introduction to WordPress",
               "date": "2022-06-15",
               "description": "Learn how to set up and manage a WordPress website."
             },
             {
               "index": 5,
               "title": "HTML5 Features",
               "date": "2024-05-12",
               "description": "Discover the new features of HTML5 and how they enhance web development."
             },
             {
               "index": 47,
               "title": "Exploring Software Testing",
               "date": "2023-10-17",
               "description": "Learn about different software testing methodologies and their importance."
             },
             {
               "index": 21,
               "title": "Exploring Cloud Computing",
               "date": "2024-02-28",
               "description": "Understanding the basics of cloud computing and its services."
             },
             {
               "index": 17,
               "title": "GraphQL Basics",
               "date": "2024-06-15",
               "description": "Explore GraphQL and how it differs from REST APIs."
             },
             {
               "index": 50,
               "title": "Future Trends in Technology",
               "date": "2023-12-12",
               "description": "Discuss emerging trends in technology and their potential effects on the future."
             },
             {
               "index": 26,
               "title": "Cybersecurity Essentials",
               "date": "2022-01-10",
               "description": "An overview of cybersecurity principles and practices."
             },
             {
               "index": 8,
               "title": "Responsive Web Design",
               "date": "2024-08-30",
               "description": "Techniques for creating websites that work on various devices and screen sizes."
             },
             {
               "index": 22,
               "title": "Java for Beginners",
               "date": "2024-01-20",
               "description": "A guide to getting started with Java programming language."
             },
             {
               "index": 9,
               "title": "Introduction to React",
               "date": "2024-09-11",
               "description": "Get started with React and learn how to build dynamic user interfaces."
             },
             {
               "index": 10,
               "title": "Node.js for Beginners",
               "date": "2024-10-01",
               "description": "An introduction to Node.js, its features, and how to create server-side applications."
             },
             {
               "index": 42,
               "title": "Introduction to Artificial Intelligence",
               "date": "2023-05-25",
               "description": "Learn the basics of artificial intelligence and its applications."
             },
             {
               "index": 19,
               "title": "Building Mobile Apps with React Native",
               "date": "2024-04-20",
               "description": "Learn how to create cross-platform mobile applications using React Native."
             },
             {
               "index": 37,
               "title": "The Future of Quantum Computing",
               "date": "2022-12-18",
               "description": "Explore the potential of quantum computing and its implications for technology."
             },
             {
               "index": 6,
               "title": "Building RESTful Services",
               "date": "2024-06-07",
               "description": "A step-by-step guide to creating RESTful services using Node.js."
             },
             {
               "index": 13,
               "title": "Web Accessibility Basics",
               "date": "2024-10-25",
               "description": "An overview of web accessibility and best practices to make your website inclusive."
             },
             {
               "index": 28,
               "title": "Introduction to Flutter",
               "date": "2022-03-20",
               "description": "Get started with Flutter for building natively compiled applications."
             },
             {
               "index": 48,
               "title": "Introduction to Cyber Threats",
               "date": "2023-11-05",
               "description": "An overview of common cyber threats and how to protect against them."
             },
             {
               "index": 46,
               "title": "Getting Started with Ruby on Rails",
               "date": "2023-09-10",
               "description": "A beginner's guide to developing web applications using Ruby on Rails."
             },
             {
               "index": 36,
               "title": "Introduction to Kotlin",
               "date": "2022-11-08",
               "description": "Learn about Kotlin, a modern programming language for Android development."
             },
             {
               "index": 11,
               "title": "Understanding Asynchronous JavaScript",
               "date": "2024-10-15",
               "description": "Explore the concepts of asynchronous programming in JavaScript using callbacks and promises."
             },
             {
               "index": 16,
               "title": "Creating User Interfaces with Vue.js",
               "date": "2024-07-05",
               "description": "Learn how to build interactive web interfaces using Vue.js."
             },
             {
               "index": 20,
               "title": "DevOps Fundamentals",
               "date": "2024-03-01",
               "description": "An introduction to DevOps practices and tools for efficient software development."
             },
             {
               "index": 33,
               "title": "Fundamentals of UI/UX Design",
               "date": "2022-08-22",
               "description": "An introduction to UI/UX design principles and best practices."
             },
             {
               "index": 23,
               "title": "Understanding Blockchain Technology",
               "date": "2024-11-01",
               "description": "Learn about blockchain technology and its applications beyond cryptocurrency."
             },
             {
               "index": 25,
               "title": "Data Visualization Techniques",
               "date": "2024-09-05",
               "description": "Explore various techniques for visualizing data effectively."
             }
            ]"""
}