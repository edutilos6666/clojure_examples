(ns com.edutilos.main.Runner)
;  (gen-class
;   :name com.edutilos.main.Runner
;    )
;  )
;
;(defn -main []
;  (println "hello world")
;  )
;
;
;(.main com.edutilos.main.Runner)


(compile 'ArithmeticOps)
(def ex (new com.edutilos.main.ArithmeticOps))

(println (.getLocation ex))

