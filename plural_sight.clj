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

;; ======== Data Structures

[1 2 3 4] ; This is a vector
'[1 2 3 (+ 1 2)] ; This is a vector before evaluation funtions inside

'(1 2 3 4) ; This is a list

; Maps
(def my_map {:a 1 :b 2})
(assoc my_map :c 3) ; This'll build a new data structure
(my_map :a) ; -> 1

(def user {:name "Carlo", :username "carlogilmar" :address {:zip 10000}})
(get-in user [:address :zip]) ; -> 10000
(assoc-in user [:address :zip] 12500) ; -> This'll generate a new map

;; Sets
#{1 2 3}
