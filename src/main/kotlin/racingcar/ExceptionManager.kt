package racingcar

class ExceptionManager {
    fun nameException( name : List<String>){
        for (index in name){
            if (index.length>5){
                throw IllegalArgumentException("이름을 5자 이하로 입력해주세요")
            }

        }
    }
}