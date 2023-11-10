const tableSize = 10;

// Outer loop for the rows
for (let i = 1; i <= 10; i++) {
  let table = '';
  
  // Inner loop for the columns
  for (let j = 1; j <= 10; j++) {

    // Calculate the product and add it to the row
    const product = i * j;
    table += `${i} x ${j} = ${product}\t`;
  }
  
  // Print the row

  console.log(table)
}