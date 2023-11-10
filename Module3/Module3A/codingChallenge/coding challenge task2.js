
// Create a length converter function

function convertLength(value, fromMeter, toInch) {

    const conversionTable = {
      meter: 1,
      inch: 39.3701,
    };
  

    if (!(fromMeter in conversionTable) || !(toInch in conversionTable)) {
      return "Invalid units";
    }
  

    const valueInMeters = value / conversionTable[fromMeter];
  

    const result = valueInMeters * conversionTable[toInch];
  
    return result;
  }
  

  const lengthInMeters = 5;
  const convertedLengthInInches = convertLength(lengthInMeters, "meter", "inch");
  
  console.log(`${lengthInMeters} meters is equal to ${convertedLengthInInches} inches`);
  