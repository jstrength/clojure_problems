(ns project-euler.collatz-sequence-14)

(defn collatz [n]
  "integer -> vector[integers]"
  (loop [v [n]]
    (def cur (first v))
    (if (= cur 1) v
      (if (odd? cur)
          (recur (cons (+ (* cur 3) 1) v))
          (recur (cons (/ cur 2) v))))))

(println (last
           (reduce #(if (> (count %1) (count %2)) %1 %2)
                   (map #(collatz %) (take 1000000 (iterate inc 1))))))