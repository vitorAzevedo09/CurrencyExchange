Certainly! Here's how you can incorporate the example API URL into the README:

---

**How to Use:**

1. **Install Java 17:** Ensure that you have Java 17 installed on your system. You can download and install Java 17 from the official website: [Java Downloads](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

2. **Download the Currency Exchange App:** Clone the repository or download the source code to your local machine.

3. **Build the App:** Open a terminal or command prompt, navigate to the root directory of the Currency Exchange App, and run the following Maven command to build the application:
   ```
   mvn clean package
   ```

4. **Run the App:** After successfully building the application, navigate to the `target` directory where the JAR file is located. The JAR file will be named something like `currency-exchange-1.0-SNAPSHOT-jar-with-dependencies.jar`. Run the following command to execute the application:
   ```
   java -jar currency-exchange-1.0-SNAPSHOT-jar-with-dependencies.jar "https://v6.exchangerate-api.com/v6/f85198bb6c8faa4db32fb26e""
   ```
   Replace `"https://v6.exchangerate-api.com/v6/f85198bb6c8faa4db32fb26e"` with your actual API URL. For example, `"https://v6.exchangerate-api.com/v6/YOUR-API-TOKEN"`.

5. **Follow the on-screen instructions:** The application will prompt you to input the base currency, target currency, and amount to convert. Follow the instructions provided by the application to perform the currency exchange.

---

Make sure to replace `"https://v6.exchangerate-api.com/v6/your-api-token"` with the actual API URL provided by the exchange rate API provider.
