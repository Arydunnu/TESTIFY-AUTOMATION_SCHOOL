def length_converter(length, from_unit, to_unit):
    units = {
        'mm': 0.001,
        'cm': 0.01,
        'm': 1.0,
        'km': 1000.0,
        'in': 0.0254,
        'ft': 0.3048,
        'yd': 0.9144,
        'mi': 1609.344
    }

    if from_unit not in units or to_unit not in units:
        return "Invalid units"

    # Convert to base unit (meters)
    length_meters = length * units[from_unit]

    # Convert to target unit
    result = length_meters / units[to_unit]

    return result

# Example usage
print(length_converter(100, 'cm', 'm'))  # Convert 100 centimeters to meters
print(length_converter(1, 'km', 'mi'))   # Convert 1 kilometer to miles