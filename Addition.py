#This program add two integers

#Addition function which takes two position arguments
def Addition(value1,value2):
	ans = value1+value2
	return ans

#main function to accept two parametars
def main():
	no1=int(input("Enter First Number: "))
	no2=int(input("Enter second Number: "))

	ret = Addition(no1,no2)

print("start of program...")

if __name__ == '__main__':
	main();#function call


print("End of program...")
