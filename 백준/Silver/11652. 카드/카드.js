const [length, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(x => BigInt(x));
const map = new Map();

const result = input.reduce((max, crr) => {
  const now_card = (map.get(crr) || 0) + 1;
  const max_card = (map.get(max) || 0);

  map.set(crr, now_card);

  if(now_card > max_card)
    max = crr;
  else if(now_card === max_card) {
    crr < max ?
      max = crr : max;
  }
  return max;
}, 0n)

console.log(result.toString())