def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def main():
	a = 50
	fact_a = factorial(a)
	print('factorial of {} is {}'.format(a, fact_a))

if __name__ == '__main__':
	main()