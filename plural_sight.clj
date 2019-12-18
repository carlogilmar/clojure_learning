;;  Anonymous functions

(fn [message]
  (println message))

;; Store a function
(def my_fun  (fn [x] (+ x 1)))

(my_fun 1)  ;; <- invoke my anonymous function *like Elixir*

;; Local scope LET

(let [x 1 y 2] (+x y))

;;  MultiArity
(defn messenger
  ([] (messenger "Sin argumentos"))
  ([msg] (println msg))
  ([a b] (messenger "Dos argumentos")))

;; Variadic Func
(defn greet [name & rest] (print "Hello" name rest))
(greet "carlo" "gilmar" "padilla" "saktan")
;; -> Hello carlo (gilmar padilla saktan)

;; Apply Func
(defn greet [name & rest] (apply print name rest))
;; carlo gilmar padilla saktannil

;; Closures
(defn my_fun[name] (fn [x] (println name) (println x)))
;; Invoke this function
((my_fun "carlo") "gilmar")
;; Store in local var
(def greeting (my_fun "carlo"))
(greeting "que onda")

;; Anonymous Functions notation
;; -> #(* %1 2)
(def fun #(* %1 2))
(fun 1)



