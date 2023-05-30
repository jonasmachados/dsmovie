# DSMovie

![DSMovie Logo](https://user-images.githubusercontent.com/67349235/170359343-dc1d3682-1e8d-422c-b028-8f1c50d0f1f6.gif)

DSMovie is a full-stack project developed using Spring Boot for the back-end and TypeScript for the front-end. It is a film catalog application that allows users to browse and evaluate films. The project utilizes PostgreSQL as the database for data storage.

## Features

- Film Catalog: Browse through a collection of films with their respective names, images, and ratings.
- User Evaluation: Users can rate films by providing their email and rating in the evaluation section.
- User-Friendly Interface: The front-end is built using TypeScript, HTML, CSS, and JavaScript, providing an intuitive and visually appealing user experience.

## Technologies Used

### Back-end

- JDK 15: Java Development Kit 15 - a development kit for building applications and components using the Java programming language.
- Maven: Maven is a build automation tool primarily used for Java projects.
- Postman: Postman is an API testing tool used to send HTTP requests and analyze responses.
- PostgreSQL: PostgreSQL is a powerful open-source object-relational database management system.
- Heroku: Heroku is a cloud platform that allows you to deploy, manage, and scale applications.

### Front-end

- TypeScript: TypeScript is a strongly-typed superset of JavaScript that compiles to plain JavaScript.
- HTML: HTML is the standard markup language for creating web pages.
- CSS: CSS is a style sheet language used for describing the look and formatting of a document written in HTML.
- JavaScript: JavaScript is a programming language that enables interactive web pages and web applications.
- Yarn: Yarn is a package manager for JavaScript that allows you to efficiently manage dependencies.
- Node: Node.js is an open-source, cross-platform JavaScript runtime environment.
- ReactJS: ReactJS is a JavaScript library for building user interfaces.
- Netlify: Netlify is a web development platform used for deploying and hosting web applications.

## Deployed Application

The DSMovie application is deployed and can be accessed [here](https://jonasms-dsmovie.netlify.app).

## Endpoints

### Back-end Endpoints

- Movies:
  - GET /movies: Get all movies.
  - GET /movies/{id}: Get a specific movie by ID.

- Scores:
  - PUT /scores: Update movie scores.

### Front-end Routing

```jsx
<Route path="/" element={<Listing />} />
<Route path="/form/:movieId" element={<Form />} /> 
```
The front-end has two main endpoints:

- The root path ("/") is associated with the Listing component, which displays the film catalog.
- The "/form/:movieId" path is associated with the Form component, which allows users to provide email and ratings for a specific movie.

## Getting Started

To get started with the DSMovie project, follow these steps:

1. Clone the repository.
2. Set up the necessary dependencies, including JDK 15, Maven, and Node.js.
3. Configure the PostgreSQL database connection.
4. Build and run the back-end application using Spring Boot.
5. Build and run the front-end application using TypeScript, HTML, CSS, and ReactJS.
6. Access the DSMovie application in your web browser.

## License

This project is licensed under the [MIT License](LICENSE).


