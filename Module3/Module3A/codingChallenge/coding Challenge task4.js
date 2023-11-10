
// Print a table containing multiplication tables.

const tableSize = 10;


for (let i = 1; i <= 10; i++) {
  let table = '';
  
  for (let j = 1; j <= 10; j++) {

    const product = i * j;
    table += `${i} x ${j} = ${product}\t`;
  }
  

  console.log(table)
}