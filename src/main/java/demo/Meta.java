Class<?> cls = Person.class;
Method method = cls.getMethod("setName", String.class);
Object obj = cls.newInstance();
method.invoke(obj, "Alice");


