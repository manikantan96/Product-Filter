import java.io.*;

public class ProductFilter {
    public static void main(String[] args) {
        String inputFile = "products.csv";   // input CSV file
        String outputFile = "filtered_products.csv"; // output CSV file

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile)
        ) {
            String line;
            
            // Write CSV header to output file
            fw.write("Name,Price\n");

            while ((line = br.readLine()) != null) {
                // Split by comma
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());

                    // Filter condition: price > 1000
                    if (price > 1000) {
                        fw.write(name + "," + price + "\n");
                    }
                }
            }

            System.out.println("✅ Filtering complete! Check '" + outputFile + "' for results.");

        } catch (FileNotFoundException e) {
            System.out.println("❌ Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("❌ Error reading/writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid number format in CSV file.");
        }
    }
}

