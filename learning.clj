(defn evaluate_response [response]
   (cond
     (= response ([:ok 122])) (println "Success!")
     (= response ([:error 0])) (println "Errorz!")
     :else (println "This was an error")
     )
  )

;(defn announce-treasure-location
;      [{lat :lat lng :lng}]
;       (println (str "Treasure lat: " lat))
;       (println (str "Treasure lng: " lng)))

;(defn workhorse
;  ([{:a a}]
;   (println  "Heeey"))
;  ([{:a a :b b}]
;   (println "Heeey twiec"))
;  )
;
;(workhorse {:a "holi"})

;; Store an empty vector in atom
(def todos (atom [])) ;; use a vector

;; Update the value of the atom
(defn add-todo! [item]
    (swap! todos conj item))

;; Adding items
(add-todo! "Buy kitten")
(add-todo! "Buy cat food")
(add-todo! "Feed kitten")

;; doseq is a for
(doseq [item @todos]
    (prn item))
