;(defn fizzbuzz [i]
;  (cond
;    (= 0 (mod i (* 3 5)) "FizzBuzz"
;    (= 0 (mod i 5)) "Fizz"
;    (= 0 (mod i 3)) "Buzz"
;    :else (str i))))

(defn fizzbuzz
  ([index]
  (cond
    (= 0 (mod index (* 3 5))) (println "FizzBuzz")
    (= 0 (mod index 5)) (println "Fizz")
    (= 0 (mod index 3)) (println "Buzz")
    :else (println index)
    ))
  ([start end]
    (println "Hola mundo")
   )
  )

(fizzbuzz 15)
(fizzbuzz 5)
(fizzbuzz 3)
(fizzbuzz 3)
