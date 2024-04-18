
**How to Use:**

1. **Create an Account:** Before using the Currency Exchange App, you need to create an account on the exchange rate API website. Visit [ExchangeRate-API](https://www.exchangerate-api.com/) and sign up for an account. Once you've signed up, you'll receive an API token that you'll need to use with the Currency Exchange App.

2. **Install Java 17:** Ensure that you have Java 17 installed on your system. You can download and install Java 17 from the official website: [Java Downloads](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

3. **Download the Currency Exchange App:** Clone the repository or download the source code to your local machine.

4. **Build the App:** Open a terminal or command prompt, navigate to the root directory of the Currency Exchange App, and run the following Maven command to build the application:
   ```
   mvn clean package
   ```

5. **Run the App:** After successfully building the application, navigate to the `target` directory where the JAR file is located. The JAR file will be named something like `currency-exchange-1.0-SNAPSHOT-jar-with-dependencies.jar`. Run the following command to execute the application:
   ```
   java -jar currency-exchange-1.0-SNAPSHOT-jar-with-dependencies.jar "https://v6.exchangerate-api.com/v6/your-api-token"
   ```
   Replace `"https://v6.exchangerate-api.com/v6/your-api-token"` with the API URL provided by the exchange rate API website.

6. **Follow the on-screen instructions:** The application will prompt you to input the base currency, target currency, and amount to convert. Follow the instructions provided by the application to perform the currency exchange.

---

Make sure to replace `"https://v6.exchangerate-api.com/v6/your-api-token"` with the actual API URL provided by the exchange rate API website, and `"your-api-token"` with your actual API token.
