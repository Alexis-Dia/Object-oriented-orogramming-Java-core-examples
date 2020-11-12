In Java10 added:
    1. необходимости указывать тип локальной переменной явно. То есть теперь вы можете не указывать тип
        проинициализированной переменной, а писать что-то вроде:
            var list = new ArrayList<String>();
            //перед нами ArrayList<String>
            var stream = list.stream();
            // перед нами Stream<String>