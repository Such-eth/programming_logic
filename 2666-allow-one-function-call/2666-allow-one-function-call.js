/**
 * @param {Function} fn
 * @return {Function}
 */
var bool;
var once = function(fn) {
    bool=false;
    return function(...args){
        if(!bool){
            bool=true;
            return fn(...args);
        } else{
            return undefined;
        }
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
