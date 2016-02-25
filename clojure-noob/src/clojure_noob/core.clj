(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot...yet."
  [& args]

  (def v ["One" "Two" "Three" '(+ 2 2) #(+ 3 2)])
  (def w [7 8 9])

  (println "Mark 1")

  (println v)

  (println "Mark 2")

  (map println v)

  (println
   (str
    "Mark 3: "
    (map #(* %1 %1) [1 2 3])))

  (println
   (str
    "Mark 4: "
    (map (fn [x] (* x x)) w)))


  )
