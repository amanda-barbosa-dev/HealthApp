package br.com.ead.senac.healthapp.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.ead.senac.healthapp.model.Reminder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReminderController {

  List<Reminder> reminders = new ArrayList<>();

  @GetMapping("/home")
  public ModelAndView home() {
    ModelAndView mv = new ModelAndView("home");
    return mv;
  }
  @GetMapping("/create")
  public ModelAndView createReminder() {
    ModelAndView mv = new ModelAndView("create");
    mv.addObject("reminder", new Reminder());
    return mv;
  }

  @PostMapping("/create")
  public String createReminderList(Reminder reminder) {
    if (reminder.getId()!= null) {
      Reminder reminderFind = reminders.stream().filter(taskItem -> reminder.getId().equals(taskItem.getId())).findFirst().get();
      reminders.set(reminders.indexOf(reminderFind), reminder);
    } else {
      Long id = reminders.size() + 1L;
      reminders.add(new Reminder(id, reminder.getMedicationName(), reminder.getDate(), reminder.getTime()));
    }
    return "redirect:/list";
  }

  @GetMapping("/list")
  public ModelAndView list() {
    ModelAndView mv = new ModelAndView("list");
    mv.addObject("reminders", reminders);
    return mv;
  }

  @GetMapping("/edit/{id}")
  public ModelAndView edit(@PathVariable("id") Long id) {
    ModelAndView mv = new ModelAndView("create");
    Reminder reminderFind = reminders.stream().filter(task -> id.equals(task.getId())).findFirst().get();
    mv.addObject("reminder", reminderFind);
    return mv;
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable("id") Long id) {
    Reminder reminderFind = reminders.stream().filter(task -> id.equals(task.getId())).findFirst().get();
    reminders.remove(reminderFind);
    return "redirect:/list";
  }
}
