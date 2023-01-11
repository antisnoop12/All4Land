package composite;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
  private String name; // 디렉토리 이름
  private ArrayList directory = new ArrayList(); // 디렉토리 엔트리의 집합
  public Directory(String name) {
    this.name = name;
  }
  public String getName() { 
    // 이름을 얻는다
    return name;
  }
  public int getSize() {
    // 크기를 얻는다
    int size = 0;
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry)it.next();
      size += entry.getSize();
    }
    return size;
  }
  public Entry add(Entry entry) {
    // 엔트리 추가
    directory.add(entry);
    return this;
  }
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry)it.next();
      entry.printList(prefix + "/" + name);
    }
  }
}