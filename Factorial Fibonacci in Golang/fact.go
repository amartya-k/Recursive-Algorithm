package main

import (
	"fmt"
	"math/big"
)

func factorial(x *big.Int) *big.Int {
	n := big.NewInt(1)
	if x.Cmp(big.NewInt(0)) == 0 {
		return n
	}
	return n.Mul(x, factorial(n.Sub(x, n)))
}

func main() {
    fmt.Println("Enter the number:") 
	var n int64
	fmt.Scanln(&n)
	fmt.Println(factorial(big.NewInt(n)))
}
