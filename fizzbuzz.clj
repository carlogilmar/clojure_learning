(defn fizzbuzz [i]
  (cond
    (= 0 (mod i (* 3 5)) "FizzBuzz"
    (= 0 (mod i 5)) "Fizz"
    (= 0 (mod i 3)) "Buzz"
    :else (str i)))

(fizzbuzz 1)
(fizzbuzz 5)
(fizzbuzz 6)
(fizzbuzz 3)
