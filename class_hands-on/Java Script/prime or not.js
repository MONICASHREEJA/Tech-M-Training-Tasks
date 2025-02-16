const a = 10;
function isPrimeNumber(n) {
    if (n < 2) 
    return false;
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}

if (isPrimeNumber(a)) {
    console.log(${a} is a prime number.);
} 
else {
    console.log(${a} is not a prime number.);
}
