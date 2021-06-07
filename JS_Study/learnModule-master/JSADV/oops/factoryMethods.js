function createElf (name, weapon) {
   return { 
    // es6 way of object variable 
    name,
    weapon,
    attack() {
        return 'attack with : ' + weapon
    }
  }
}

const peter = createElf('Peter', 'Stones')
console.log(peter.attack())