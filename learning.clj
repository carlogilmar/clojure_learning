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
