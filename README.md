# Stock Portfolio Manager API

This project is a RESTful API designed for managing and tracking stock portfolios. It allows users to add, update, delete, and view stocks in their portfolio, calculate performance metrics, and search stocks by various criteria.

## Features

- Add, update, delete, and view stocks.
- Calculate performance metrics like ROI.
- Search functionality by industry sector and performance.

## Technologies Used

- Java 17
- Spring Boot
- Maven
- JUnit for testing

## Installation and Setup

1. Clone the repository:
2. Navigate to the project directory:
3. Run the application using Maven:


## Usage

To add a stock to your portfolio, send a POST request to `/api/stocks` with the stock data in the request body.

Example Request:
POST /api/stocks
{
"name": "ABC Corp",
"ticker": "ABC",
"industry": "Technology",
"purchasePrice": 100.00,
"quantity": 10
}


## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

TBC

## Contact

If you have any questions, feel free to contact me at J9Kay@gmail.com.
