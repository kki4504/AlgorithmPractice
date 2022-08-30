const [leng, ...input] = require('fs').readFileSync('../dev/stdin').toString().trim().split(' ').map(x => Number(x));

const solution = (L, I) => {
  const queue = Array.from({ length: L }, (v, i) => i + 1);
  const result = [];

  let count = 0;
  while (queue.length > 0) {
    count = (count + (I - 1)) % queue.length;
    result.push(queue[count]);
    queue.splice(count, 1);
  }
  return `<${result.join(', ')}>`
}
//   while (queue.length) {
    
//     if (count % I === 0)
//       result.push(shift);
//     else 
//       queue.push(shift)
//     count += 1
//   }
//   return `<${result.join(', ')}>`
// }

console.log(solution(leng, input))
