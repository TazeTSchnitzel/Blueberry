<?bb
class Animal
  @name
  @age = 18

  def __construct(name)
    @name = name
  end

  def greet
    echo("Hello! I'm " & @name)
  end
end

human = new Animal()
human.greet()

# This is a comment
echo(human.name)

