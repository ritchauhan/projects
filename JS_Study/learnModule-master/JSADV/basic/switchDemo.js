for (let i = 0; i<5; i++) {
    let test = 'local'
    let condition = i
    switch (condition) {
      case 1:
        if (test !== 'local') {
            console.log('inside 1 condition')
            break
        }  
      case 2:
        if (condition.match !== 'Any') {
          console.log('case2')
        }
        break
      case 3:
        break
      default:
        //evalSuccess = false // Unknown condition evaluation
        break
    }
    console.log(i)
  }