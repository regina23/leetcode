//
// Created by R on 2021/10/19.
//

struct Node {
    int value,
    Node* next
};
void print(struct  Node* head) {
    while(head->next != NULL) {
        print(head->value);
        head = head->next;
    }
}
void main() {
    Node* t = new Node();
    t->value = 5;
    t->next = nullptr;
    print(t);
}