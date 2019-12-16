(defn evaluate_response [response]
   (cond
     (= response ([:ok 122])) (println "Success!")
     (= response ([:error 0])) (println "Errorz!")
     :else (println "This was an error")
     )
  )

