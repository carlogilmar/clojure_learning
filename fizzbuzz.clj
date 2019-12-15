(defn fizzbuzz
  ;FizzBuzz
  ([index]
   (println "Starting...")
   (cond
     (= 0 (mod index (* 3 5))) (println "FizzBuzz")
     (= 0 (mod index 5)) (println "Fizz")
     (= 0 (mod index 3)) (println "Buzz")
     :else (println index)
     ))
  ; Iterator
  ([start end]
   (map fizzbuzz (range start end))
   )
)

(fizzbuzz 15)
(fizzbuzz 1 15)
