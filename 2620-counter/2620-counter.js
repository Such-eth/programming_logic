/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var val=0;
    return function() {
        if(val===0){
            val++;
            return n;
        }
        // val++;
        return n+val++;
        
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */