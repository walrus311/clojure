(ns for-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (p18)
)

(defn p18
  "Sequences and filter"
  []
  (let [c [1 2 3 4 5 6 7 8 9 10]]
    (println "Starting vector: " (type c) c)
    ;; Filter for elements greater than 5
    (println "Greater than 5: " (filter #(> % 5) c))
    ;; Filter for elements less than 5
    (println "Less than 5: " (filter #(< % 5) c))
    ;; Filter for odd elements
    (println "Odd: " (filter odd? c))
    ;; Filter for even elements
    (println "Even: " (filter even? c))
    )
)

(defn p17
  "Sequences and map"
  []
  ;; Calling map with a built in function
  (println "Mark 1: " (map inc '(1 2 3)))
  ;; Calling map with a literal function
  (println "Mark 2: " (map #(inc %) '(1 2 3)))
  ;; Calling map with an anonymous function
  (println "Mark 3: " (map (fn [x] (inc x)) '(1 2 3)))
  ;; Calling map with a named anonymous function
  (println "Mark 4: " (let [f (fn [x] (inc x))] (map f '(1 2 3))))
)

(defn p14
  "Intro to functions"
  []

  ;; Named function
  (println "Mark 0: " ((fn add-five [x] (+ x 5)) 2))
  ;; Anonymous function
  (println "Mark 1: " ((fn [x] (+ x 5)) 3))
  ;; Literal function
  (println "Mark 2: " (#(- 5 %) 3))
  ;; Named literal function
  (println "Mark 3: " (let [f #(+ % 5)] (f 10)))
  ;; Named anonymous function
  (println "Mark 4: " (let [f (fn [x] (+ 5 x))] (f 4)))
)

(defn p13
  "Sequences and the rest function"
  []
  (let [x (rest '(1 2 3))] (println (type x) x))
  (let [x (rest [1 2 3])] (println (type x) x))
  (let [x (rest #{1 2 3})] (println (type x) x))
  (let [x (rest {:a 1 :b 2 :c 3})] (println (type x) x))
  (let [x (rest [#{1 2 3} #{"a" "b" "c"} #{() {}}])] (println (type x) x))
  )

(defn p8
  "Operating on Vectors with conj"
  []
  (println (set '(1 1 1 1 2 3)))
  (println (clojure.set/union #{1 2 3} #{2 3 4}))
)

(defn p6
  "Comparing vectors"
  []
  (println "Mark 1")
  (println '(:a :b :c))
  (println (list :a :b :c))
  (println (vec '(:a :b :c)))
  (println (vector :a :b :c))
  (= '(:a :b :c) (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
  (println "Mark 2"))
