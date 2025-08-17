# 🛍️ ProductFilter

**ProductFilter** is a simple Java program that reads a CSV file containing product names and prices, filters out products priced above ₹1000, and writes the filtered results to a new CSV file.

---

## 📄 Input Format

The input file should be named `products.csv` and placed in the same directory as the program. It must contain product data in the following format:

```
ProductName,Price
Laptop,55000
Mouse,500
Phone,32000
Charger,900
Tablet,1500
```

> ⚠️ The first line (header) is not skipped in this version. Make sure your data starts from the first line or modify the code to skip headers.

---

## 📤 Output

The program creates a file named `filtered_products.csv` containing only the products with a price greater than ₹1000. Example output:

```
Name,Price
Laptop,55000.0
Phone,32000.0
Tablet,1500.0
```

---

## 🚀 How to Run

1. **Compile the program**:
   ```bash
   javac ProductFilter.java
   ```

2. **Run the program**:
   ```bash
   java ProductFilter
   ```

3. **Check the output**:
   - A file named `filtered_products.csv` will be created in the same directory.
   - Console will display:
     ```
     ✅ Filtering complete! Check 'filtered_products.csv' for results.
     ```

---

## 🧠 Features

- Reads product data from a CSV file
- Filters products with price > ₹1000
- Writes filtered data to a new CSV file
- Handles common errors like missing files and invalid formats

---

## ⚠️ Error Handling

- **FileNotFoundException**: If `products.csv` is missing
- **IOException**: For general read/write errors
- **NumberFormatException**: If price values are not valid numbers

---

## 📌 Notes

- This version uses basic string splitting (`split(",")`) and does not handle quoted fields or commas inside product names.
- For more robust CSV parsing, consider using a library like [OpenCSV](http://opencsv.sourceforge.net/).

---

## 📁 Example Files

### `products.csv`
```csv
Laptop,55000
Mouse,500
Phone,32000
Charger,900
Tablet,1500
```

### `filtered_products.csv`
```csv
Name,Price
Laptop,55000.0
Phone,32000.0
Tablet,1500.0
```

