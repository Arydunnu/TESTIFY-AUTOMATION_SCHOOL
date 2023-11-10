function convertLength(value, fromUnit, toUnit) {
    // Define conversion factors
    const conversionFactors = {
      meter: 1,
      foot: 3.28084, // 1 meter = 3.28084 feet
      inch: 39.3701, // 1 meter = 39.3701 inches
    };
  
    // Check if the units are valid
    if (!(fromUnit in conversionFactors) || !(toUnit in conversionFactors)) {
      return "Invalid units";
    }
  
    // Convert the value to meters
    const valueInMeters = value / conversionFactors[fromUnit];
  
    // Convert the value from meters to the target unit
    const result = valueInMeters * conversionFactors[toUnit];
  
    return result;
  }
  
  // Example usage:
  const lengthInMeters = 2;
  const convertedLengthInFeet = convertLength(lengthInMeters, "meter", "foot");
  const convertedLengthInInches = convertLength(lengthInMeters, "meter", "inch");
  
  console.log(`${lengthInMeters} meters is equal to ${convertedLengthInFeet} feet`);
  console.log(`${lengthInMeters} meters is equal to ${convertedLengthInInches} inches`);
  