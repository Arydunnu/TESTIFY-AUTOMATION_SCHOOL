Tasteam=["Lizzy", "Ife","Precious","Chioma","Zainab", "Olamide"]
print("names:", Tasteam)
Tasteam.append("Mary")
Tasteam.append("Ebere")
print("Append: ", Tasteam)

Tasteam.sort()
print("sort-asc :", Tasteam)
Tasteam.sort(reverse= True)
print("sort-desc :",Tasteam)

Tasteam.remove("Mary")
print("remove :",Tasteam)

count_precious= Tasteam.count("precious")
print(Tasteam)
print(count_precious)