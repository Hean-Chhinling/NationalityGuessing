
# NationalityGuessing

NationalityGuessing is a web application that predicts the likely nationality of a user based on their name. Utilizing the Nationalize.io API, the application evaluates the input name and returns possible countries of origin along with the probabilities for each. This project is built using the Spring Boot framework, Thymeleaf, Java with Maven for the backend, and HTML with CSS for the frontend.

## Features

- User-friendly interface to input names.
- Utilizes the Nationalize.io API to guess nationalities based on names.
- Displays possible countries of origin with probabilities.
- Responsive design for desktop and mobile devices.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- JDK 11 or newer.
- Maven for project dependency management.

## Setting Up

To get a local copy up and running, follow these simple steps:

1. Clone the repository:
   ```sh
   git clone https://github.com/Hean-Chhinling/NationalityGuessing.git
   ```
2. Navigate into the project directory:
   ```sh
   cd NationalityGuessing
   ```
3. Build the project with Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```
5. Visit `http://localhost:8080` in your web browser to use the application.

## Usage

1. Simply enter your name in the provided input field on the homepage.
2. Click on the "Guess Nationality" button.
3. The application will display a list of possible nationalities along with the probability percentages.

## Contributing

Contributions to NationalityGuessing are welcome! Follow these steps to contribute:

1. Fork the repository.
2. Create a branch: `git checkout -b <branch_name>`.
3. Make your changes and commit them: `git commit -am 'Add some feature'`.
4. Push to the original branch: `git push origin NationalityGuess/main`.
5. Create the pull request.

Alternatively, see the GitHub documentation on [creating a pull request](https://help.github.com/articles/creating-a-pull-request/).

## License

This project is licensed under the [MIT License](LICENSE.md) - see the LICENSE file for details.

## Acknowledgments

- Thanks to the Nationalize.io API for providing the nationality guessing functionality.
- This project is built using the Spring Boot framework, Thymeleaf, Java, and Maven.
