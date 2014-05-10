// run with `go run $filename`
package main

import (
	"fmt"
)

func main() {
	var T int
	fmt.Scan(&T)
	for t := 1; t <= T; t++ {
			fmt.Printf("Case #%d: %s\n", t, "my result")
		}
	}
}
