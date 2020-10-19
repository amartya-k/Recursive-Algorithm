// go run fibonacci.go

package main

import (
	"fmt"
)

func FibonacciRecursion(n int) int {
    if n <= 1 {
        return n
    }
    return FibonacciRecursion(n-1) + FibonacciRecursion(n-2)
}
func main() {
    fmt.Println("Enter the number:") 
	var n int
	fmt.Scanln(&n)
	fmt.Println("Answer: ",FibonacciRecursion(n))
}
