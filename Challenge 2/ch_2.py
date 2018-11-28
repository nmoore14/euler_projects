i = 0
j = 1
k = 0
total = 0

while k < 4000000:
	k = i + j
	i = j
	j = k

	print(k)

	if k % 2 == 0:
		total += k

print("Total: " + str(total))