(ns elevator.core
  (:gen-class))

(def uprequest (atom #{}))
(def downrequest (atom #{}))
(def currentfloor (atom 0))

(defn init-elevator []
	(reset! currentfloor 0))

(defn press-button [floor direction]
	(if (= direction :down)
		(swap! downrequest (fn [requests] (conj requests floor)))
     (swap!  uprequest (fn [requests] (conj requests floor)))
		))
    
(defn change-current-floor [direction]
	(swap! currentfloor (fn [n] (if ( = direction :down ) (dec n) (inc n)))))

;(defn obey-elevator [command state]
;	(if (= command :up)
;		(inc (:floor state))))